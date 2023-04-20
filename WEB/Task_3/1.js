// t °С = 5/9 (t °F - 32)
//  tf = 9/5tC + 32
const celci = +prompt("Введите температуру в градусах Цельсия");
let faren = (9 / 5 * celci + 32);
alert(`Цельсий: ${celci}, Фаренгейт: ${faren.toFixed(1)}`);