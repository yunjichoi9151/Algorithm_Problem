function solution(sizes) {
  var row = 0;
  var col = 0;
  for(var i = 0; i < sizes.length; i++) {
    var tmp = sizes[i][0] >= sizes[i][1] ? 0 : 1;
    if(row < sizes[i][tmp]) {
      row = sizes[i][tmp];
    }
    if(col < sizes[i][1 - tmp]) {
      col = sizes[i][1 - tmp];
    }
  }
  return row * col;
}