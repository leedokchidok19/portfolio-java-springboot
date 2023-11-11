### 스프링 초기화
* 스프링 부트 초기 생성
	+ ![스프링부트 생성 설정](src/main/resources/markdown/images/20231103_springboot_init.png)
* [수정 시 재빌드 되도록 properties 추가](https://ldgeao99-developer.tistory.com/639)
* [[개발환경] eclipse whitespace(공백) 표시/제거 설정](https://hong00.tistory.com/62)
* [Boot Devtools의 Live Reload 기능을 사용하면 브라우저 재호출(또는 리프레시) 없이 변경 사항을 확인](https://wikidocs.net/160957)
	+ [크롬 확장프로그램 LiveReload++](https://chrome.google.com/webstore/detail/livereload%2B%2B/ciehpookapcdlakedibajeccomagbfab/related)
* [롬복 설치](https://projectlombok.org/download)
* gradle 설정의 옵션 설명
```gradle
compileOnly
> build.gradle 파일의 compileOnly는 해당 라이브러리가 컴파일 단계에서만 필요한 경우에 사용한다.
annotationProcessor
> 컴파일 단계에서 애너테이션을 분석하고 처리하기 위해 사용한다.
runtimeOnly
런타임 시 필요한 경우에 사용
implementation
build.gradle 파일의 implementation은 해당 라이브러리 설치를 위해 일반적으로 사용하는 설정이다.   
implementation은 해당 라이브러리가 변경되더라도 이 라이브러리와 연관된 모든 모듈들을 컴파일하지 않고 직접 관련이 있는 모듈들만 컴파일하기 때문에 rebuild 속도가 빠르다.
```
* spring.jpa.hibernate.ddl-auto 옵션 설명 
```txt
spring.jpa.hibernate.ddl-auto
위 설정에서 spring.jpa.hibernate.ddl-auto를 update로 설정했다. update와 같은 설정값에 대해서 간단히 알아보자.

none - 엔티티가 변경되더라도 데이터베이스를 변경하지 않는다.
update - 엔티티의 변경된 부분만 적용한다.
validate - 변경사항이 있는지 검사만 한다.
create - 스프링부트 서버가 시작될때 모두 drop하고 다시 생성한다.
create-drop - create와 동일하다. 하지만 종료시에도 모두 drop 한다.
개발 환경에서는 보통 update 모드를 사용하고 운영환경에서는 none 또는 validate 모드를 사용한다.
```
* [스프링부트 디렉토리 구조](https://wikidocs.net/160947)
* 스프링 부트 H2 연결
	+ [H2 데이터베이스](https://wikidocs.net/161164)
	+ [SpringBoot에 H2 DB 연결하기](https://pamyferret.tistory.com/17)
* [Spring Tool Suite(STS) 자주 사용하는 단축키](https://jju-code.tistory.com/9)