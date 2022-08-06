package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {

    private String url;

    public NetworkClient() {
        System.out.println("url = " + url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect(){
        System.out.println("connect = " + url);
    }

    public void call(String message){
        System.out.println("call : " + url + " message = " + message);
    }

    //서비스 종료시 호출
    public void disConnect(){
        System.out.println("close = " + url);
    }


    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메시지");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("NetworkClient.destroy");
        disConnect();
    }

    //초기화 소멸 인터페이스 단점
    // 스프링 전용 인터페이스, 마음대로 고칠 수 없음

}
