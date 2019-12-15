let x = "9";

for (var i = 0; i < 3000000000; i++) {
  x = x + "9";
}
console.log(x);
