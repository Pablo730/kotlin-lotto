## 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1,000원이다.

## 기능 설계
- [x] 비용을 지불해 한번에 여러장 로또를 구입할 수 있다
  - [x] 로또 구입 비용이 1,000원 미만일 경우 에러가 발생한다
  - [x] 로또 구입 비용이 1,000원 단위가 아닐 경우 에러가 발생한다
  - [x] 로또 구입 비용에 대해 몇 장의 로또가 구입 됐는지 확인활 수 있다
- [ ] 로또 번호를 자동으로 부여한다
  - [ ] 로또 번호는 1부터 45사이의 중복되지 않는 숫자 6개로 이루어져야한다
- [ ] 로또 당첨 번호를 입력할 수 있다
  - [ ] 로또 당첨 번호가 1부터 45사이의 중복되지 않는 숫자 6개가 아닐 시 에러가 발생한다
- [ ] 로또 당첨 번호 3개가 일치할 경우 당첨금 5,000원을 부여한다
- [ ] 로또 당첨 번호 4개가 일치할 경우 당첨금 50,000원을 부여한다
- [ ] 로또 당첨 번호 5개가 일치할 경우 당첨금 1,500,000원을 부여한다
- [ ] 로또 당첨 번호 6개가 일치할 경우 당첨금 2,000,000,000원을 부여한다
- [ ] 구입 금액 기준 수익률을 계산한다

--- 
## 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.
  
## 힌트
- 로또 자동 생성은 shuffled()을 활용한다.
- sorted()를 활용해 정렬 가능하다.
- contains()를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.
