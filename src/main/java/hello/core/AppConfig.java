package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //싱글톤 보장해준다
public class AppConfig {

    //@bean memberservice -> new memorymemberrepository()
    //@bean orderservice -> new memorymemberrepository()
    //어라?그럼 싱글톤이 깨지는거 아닌가?

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    //커맨드 e : 최근 열어본 파일? 목록
    //option command m -> 중복 메서드 리팩토링
    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        //return new OrderServiceImpl(memberRepository(), discountPolicy());

        return null;
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
