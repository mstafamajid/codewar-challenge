
import 'dart:math';

int checkchoose(int m, int n) {
  for (int x = 0; x <= n; x++) {
    if (binomialCoefficient(n, x) == m) {
      return x;
    }
  }
  return -1;
}

int binomialCoefficient(int m, int n) {
    List<List<int>> table = List.generate(m + 1, (i) => List<int>.filled(min(i, n) + 1, 0));
 for (int i = 0; i <= m; i++) {
    for (int j = 0; j <= min(i, n); j++) {
      table[i][j] = (j == 0 || j == i) ? 1 : table[i - 1][j - 1] + table[i - 1][j];
    }
  }
  return table[m][n];
}

void main() {
  print(checkchoose(6, 4));  // Output: 2
  print(checkchoose(4, 4));  // Output: 1
  print(checkchoose(4, 2));  // Output: -1
  print(checkchoose(35, 7)); // Output: 3
  print(checkchoose(36, 7)); // Output: -1

  int a = 47129212243960;
  print(checkchoose(a, 50));     // Output: 20
  print(checkchoose(a + 1, 50)); // Output: -1
}
