function solution(price, money, count) {
    return Math.max(0, price * (count * (count + 1) / 2) - money);
}