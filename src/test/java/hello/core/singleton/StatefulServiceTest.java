package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA: a 사용자가 10000원을 주문
        int userAPrice = statefulService1.order("userA", 10000);
        //threadb : b사용자가 2만원을 주문
        int userBPrice = statefulService2.order("userB", 20000);

        //threada : 사용자 a가 주문 금액을 조회
//        int price = statefulService1.getPrice();
        //의도는 만원이 나와야함. 하지만 2만원이 나옴

        System.out.println("price = " + userAPrice);
        //같은 인스턴스를 쓰기 때문이다

        Assertions.assertThat(userAPrice).isEqualTo(10000);
        Assertions.assertThat(userBPrice).isEqualTo(20000);
    }

    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
         return new StatefulService();
        }
    }
}