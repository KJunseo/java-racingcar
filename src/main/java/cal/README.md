# 단위테스트 실습 - 문자열 계산기
    
## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 목록 
* 사용자에게 계산식에 대한 입력을 받아야 한다.
    * **예외** : 계산식배열의 짝수번째 인덱스는 숫자만 입력받아야 한다.
    * **예외** : 계산식배열의 홀수번째 인덱스는 연산기호만 입력받아야 한다.
    
* 사용자의 입력을 토대로 계산을 해야 한다.
    * **예외** : 계산식 도중에 0으로 나누는 경우 예외를 처리해 주어야 한다.
* 계산을 한 값의 결과를 출력해야 한다.


## 테스트 코드 목록
* 연산기호가 하나일때 계산결과를 테스트한다. 
    * 덧셈에 대한 로직을 테스트한다.
    * 뺼셈에 대한 로직을 테스트한다.
    * 곱셈에 대한 로직을 테스트한다.
    * 나눗셈에 대한 로직을 테스트한다.
 * 연산기호가 두개일때 계산결과를 테스트 한다.
 * 연산기호가 세개일때 계산결과를 테스트 한다.


