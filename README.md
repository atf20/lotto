# 로또 자동 만들기

## 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

```shell
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```

## 코드리뷰 요청

```shell
git clone https://github.com/kkywalk2/kky-blog
```
- 저장소를 클론

```shell
git branch {대충 새로운 브랜치 이름}
```
- 클론한 디렉토리에 들어가서 새로운 branch 생성

```shell
git push
```
- 개발을 진행하고(커밋이나 잡다한 작업들 포함) 원격 저장소에 push

![PR](https://github.com/kkywalk2/lotto/assets/18114747/3997f990-1642-475e-bd0b-0866a9a4e7f6)
- githun 저장소에 접속하여 pull request 클릭하고 `new pull request` 클릭

![pr2](https://github.com/kkywalk2/kky-blog/assets/18114747/93fc0d97-e947-42d3-8df9-f77f7f87df8a)
- 자신이 push한 branch를 선택하고 `create pull request` 클릭

![pr3](https://github.com/kkywalk2/kky-blog/assets/18114747/5fe75d2e-f9a9-4fae-80fe-a019fa657e04)
- 리뷰요청할 대상을 선택 후(아마도 kkywalk2 선택하면 될듯) 코멘트 남길 것 있으면 남기고 `create pull request` 를 클릭하면 요청이 완료 된다 
