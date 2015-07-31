class Person(name: String = "", age: Int) {
  // val 이나 var 없는 인자가 메소드에서 쓰이면 필드가 된다
  // private[this] val 과 같다
  def description = name + " is " + age + " years old"
}
val person7_2_1 = new Person(age = 5)
person7_2_1.description
/*
기본 생성자 인자를 위해 생성되는 필드와 메소드

--------------------------------------------------------------------------------------------
기본 생성자 인자                       | 생성된 필드/메소드
--------------------------------------------------------------------------------------------
name: String                       | 오브젝트-비공개 필드 혹은 메소드가 name 을 사용하지 않으면 필드 없음.
--------------------------------------------------------------------------------------------
private val/var name: String       | 비공개 필드, 비공개 게터/세터
--------------------------------------------------------------------------------------------
val/var name: String               | 비공개 필드, 공개 게터/세터
--------------------------------------------------------------------------------------------
@BeanProperty val/var name: String | 비공개 필드, 공개 스칼라와 자바빈 게터/세터
--------------------------------------------------------------------------------------------
 */