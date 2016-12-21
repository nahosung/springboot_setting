# springboot_setting
##소개
eclipe spring-boot rest api 프로젝트 기본 셋팅
(spring-boot + maven + mybatis + mysql)

##버전 (pom.xml)
- spring boot 1.4.2
- mybatis 3.4.1
- mysql

##실행환경
- jdk 1.8 (하위버전 무관)
- maven (별도 설정 필요)
- mysql

##설명
- http://localhost:8080/usercheck
  위의 url에 post로 useremail이란 key값에 value를 담아 전송시 쿼리 조회 후 결과를 json으로 return
- application.properties 파일에서 DB 접속 정보 설정 가능
- rest api 프로젝트로 별도의 view화면은 없음
- 쿼리문은 admin이란 테이블에 admin_id 컬럼을 카운팅 (추후 DB정보 업로드)

(http://nahosung.tistory.com/66 - 자세한 설명 )