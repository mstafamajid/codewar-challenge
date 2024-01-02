int find(List numbers) {
int evenCount = 0;
  int oddCount = 0;
  

  for (int i = 0; i < 3; i++) {
    if (numbers[i].isEven) {
      evenCount++;
    } else {
      oddCount++;
    }
  }

  // Determine the majority parity based on the counts
  bool majorityIsEven = evenCount > oddCount;

 
  for (int number in numbers) {
    if ((number.isEven) != majorityIsEven) {
      return number;
    }
  }

 
  return -1;
}

void main() {
  List<int> numbers1 = [2, 4, 6, 8, 3];
  List<int> numbers2 = [1, 3, 4, 7, 3];
  
  print(find(numbers1)); 
  print(find(numbers2)); 
}
