# 자바 핵심 개념 정리
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
- boolean: 1bit <br>- char: 2byte <br> - byte: 1byte
<br> - short: 2byte <br> - int: 4byte <br> - long: 8byte
<br> - float: 4byte <br> - double: 8byte
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
- 오버라이딩: 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소르를 재작성하는 것. 메소드의 이름, 인자의 타입, 개수, 리턴 타입 등이 모두 동일해야 한다. 
실행 시간에 오버라이딩된 메소드를 찾아 호출하는 동적 바인딩 방식이다.<br> 
- 오버로딩: 같은 클래스나 상속 관계에서 동일한 이름의 메소드를 중복으로 작성하는 것. 메소드 이름은 동일하나, 인자의 개수나 타입이 달라야 한다.
컴파일 시에 중복된 메소드 중 호출되는 메소드를 결정하는 정적 바인딩 방식이다.
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
데이터(ex. 필드)와 기능(ex. 메소드)을 하나로 묶어놓은 것을 객체라고 하는데, 
컴퓨터가 수행하는 작업을 객체 간의 상호작용으로 표현하고, 클래스 혹은 객체들의 집합으로 프로그램을 작성하는 것이 객체지향 프로그래밍이다. <br>
객체지향 프로그래밍의 특징은 캡슐화, 상속, 다형성이다. 
캡슐화는 불필요한 정보의 노출을 최소화하고 꼭 필요한 정보만 노출하는 기법으로, 객체를 외부의 접근으로부터 보호하기 위해 사용된다. 
상속은 새로운 객체를 정의할 때, 기존 객체를 재사용하는 용도로 사용된다. 하위 객체가 상위 객체의 속성과 메소르를 모두 사용할 수 있으며, 필요 시 상위 객체의 메소드를 재정의할 수 있다.
다형성은 같은 이름의 메소드가 클래스나 객체에 따라 다르게 동작하도록 구현하는 것이다. 메소드 오버로딩과 메소드 오버라이딩은 다형성을 구현한다.
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
- 추상 클래스: abstract로 선언된 클래스로, 상속을 위한 슈퍼클래스로 활용된다. 추상 메소드를 가지면 반드시 abstract로 선언해야 한다. 추상 클래스는 온전한 클래스가 아니므로 인스턴스를 생성할 수 없다.<br> 
- 인터페이스: 클래스가 구현해야 할 메소드들이 선언되는 것. 인터페이스에는 필드를 선언할 수 없다. 인터페이스 구현 시 implements 키워드를 사용하고, 인터페이스 간 상속 시 extends 키워드를 사용한다. <br>
- 차이: 추상 클래스는 다중 상속이 불가하나, 인터페이스는 다중 상속이 가능하다.
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
가리키는 레퍼런스가 하나도 없는 객체인 가비지를 자바 가상 기계의 가비지 컬렉터가 자동으로 수집한 것을 가비지 컬렉션이라고 한다. 
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">
// 내용 입력
</div>
</details>
<br>

