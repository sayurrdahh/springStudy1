package hello.core.order;

import hello.core.AppConfig;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }
/*
    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }*/


    /* 필드 인젝션은 안쓰는게 좋다. 변경이 어렵기 때문(세터..)
    @Test
    void fieldInjectionTest() {
        OrderServiceImpl orderService = new OrderServiceImpl();

        orderService.setDiscountPolicy(DiscountPolicy discountPolicy);

        //orderService.createOrder(1L,"itemA",10000);

    }*/
}
