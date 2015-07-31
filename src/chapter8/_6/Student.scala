package chapter8._6

/**
 * 추상 def 를 val 로 오버라이드
 *
 * def 는 오직 다른 def 만 오버라이드 가능
 * val 은 다른 val 이나 인자 없는 def 만 오버라이드 가능
 * var 은 오직 추상 var 만 오버라이드 가능
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
abstract class Person6 {
  def id: Int
}

class Student(override val id: Int) extends Person6 {

}

/*
----------------------------------------------------------------------------------------------
             | val 로                                                    | def 로 | var 로
----------------------------------------------------------------------------------------------
val 오버라이드 | 1. 서브클래스가 비공개 필드를 가짐 (슈퍼클래스 필드와 같은 이름은 괜찮음) | 에러 | 에러
            | 2. 게터가 슈퍼클래스 게터를 오버라이드함
----------------------------------------------------------------------------------------------
def 오버라이드 | 1. 서브클래스가 비공개 필드를 가짐       | 자바와 마찬가지 | var 은 게터/세터 쌍을 오버라이드 가능
            | 2. 게터가 슈퍼클래스 메소드를 오버라이드함               | 게터만 오버라이드하는 것은 에러
----------------------------------------------------------------------------------------------
var 오버라이드 | 에러                              | 에러         | 슈퍼클래스 var 이 추상일 때만(8.8절 참고)
----------------------------------------------------------------------------------------------
 */