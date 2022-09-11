# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항
[메뉴 그룹]

1. 메뉴그룹을 생성한다
    - 메뉴 그룹의 이름은 필수로 입력되어야 한다.
2. 생성된 메뉴 그룹을 조회한다.

[메뉴]

1. [ ] 메뉴를 생성한다.
    - [ ] 메뉴는 하나의 메뉴그룹에 속해있다.
    - [ ] 메뉴의 가격(0원 이상)과 이름은 필수로 입력되어야 한다.
    - [ ] 메뉴의 이름에 비속어가 포함되어있으면 안된다.
    - [ ] 메뉴에 속한 상품들의 총 가격보다 메뉴의 가격이 더 비싸야한다.
    - [ ] 메뉴에 속한 상품의 갯수가 음수일 수 없다.
    - [ ] 등록되어있는 상품만 메뉴로 등록 가능하다.

2. [ ] 메뉴의 가격을 수정한다.
    - [ ] 수정할 가격은 필수로 입력되어야 한다.
    - [ ] 메뉴에 속한 상품들의 총 가격보다 변경하려는 메뉴의 가격이 더 비싸다면 수정이 불가능하다

3. [ ] 메뉴는 진열이 가능하다.
    - [ ] 메뉴에 속한 상품들의 총 가격보다 메뉴의 가격이 더 비싸다면 진열이 불가능하다.

4. [ ] 메뉴는 숨길 수 있다.

5. [ ] 생성된 메뉴 목록을 조회한다.

[주문]
1. [ ] 주문을 생성한다.
    - [ ] 주문 타입과 수량은 필수로 입력되어야 한다.
    - [ ] 존재 하지않는 메뉴는 주문할 수 없다.
    - [ ] 진열 되지않은 메뉴는 주문할 수 없다.
    - [ ] 메뉴의 가격과 요청된 주문의 가격이 다르면 주문할 수 없다.
2. [ ] 주문을 수락한다.
    - [ ] 대기중인 주문만 수락이 가능하다.
3. [ ] 주문을 제공한다.
    - [ ] 수락된 주문만 메뉴를 제공할 수 있다.
4. [ ] 모든 주문 목록을 조회한다.
- [ ] 배달주문
  - [ ] 주문하는 메뉴의 수량이 존재해야한다.
  - [ ] 주문 시, 주소는 필수로 입력되어야 한다.
  - [ ] 주문 수락 시, 라이더 배달 요청을 한다.
  - [ ] 주문의 종류가 배달 주문이어야 한다.
  - [ ] 주문한 메뉴가 준비되어있어야 배달이 가능하다.
  - [ ] 배달을 완료한다.
  - [ ] 아직 주문의 상태가 배달중이라면, 주문을 완료할 수 없다.
- [ ] 포장주문
  - [ ] 주문하는 메뉴의 수량이 존재해야한다.
  - [ ] 메뉴가 제공되었을 때, 주문을 완료할 수 있다.
- [ ] 매장식사
  - [ ] 주문 시, 손님은 해당 테이블에 앉아야 한다. (점유하고 있어야 한다.)
  - [ ] 메뉴가 제공되었을 때, 주문을 완료할 수 있다.
  - [ ] 주문이 모두 완료된 테이블이 있다면 비어있는 상태로 정리한다.

[주문 테이블]

1. [ ] 주문 테이블을 생성한다.
    - [ ] 이름은 필수로 입력되어야 한다.
2. [ ] 손님은 테이블에 앉을 수 있다.
3. [ ] 테이블을 청소한다. (정보를 초기화 한다)
    - [ ] 완료되지 않는 주문이 없어야 한다.
4. [ ] 주문 테이블의 손님 숫자를 수정한다.
    - [ ] 손님의 수는 음수일 수 없다.
    - [ ] 사용중인 테이블이 아닐경우 변경할 수 없다
5. [ ] 모든 주문 테이블을 조회한다.

[상품]

1. [ ] 상품을 생성한다.
    - [ ] 상품의 가격(0원 이상)과 이름은 필수로 입력되어야 한다.
    - [ ] 상품의 이름은 비속어가 포함되어있으면 안된다.
2. [ ] 상품의 가격을 수정한다.
    - [ ] 상품의 가격(0원 이상)은 필수로 입력되어야 한다.
    - [ ] 해당 상품이 포함된 메뉴의 가격이, 메뉴에 속한 상품들의 총 가격보다 비싸다면 메뉴 진열이 불가능하다.
3. [ ] 생성된 상품 목록을 조회한다.


## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
|  |  |  |

## 모델링
