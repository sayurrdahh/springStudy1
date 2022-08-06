package hello.core.singleton;

public class SingletonService {

    //자기자신을 내부에 static 으로 있음?
    private static final SingletonService instance = new SingletonService();

    //조회할 땐 얘를 쓰면 됨
    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
