void main(){
print(minValue([6,4, 7,6, 5, 7,8,2,9,9]));
}

int minValue(List<int> arr) =>int.parse((arr..sort()).toSet().join(""));
  
