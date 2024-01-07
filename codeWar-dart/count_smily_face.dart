import 'dart:core';
int countSmileys(List<String> arr) {
  
  RegExp pattern = RegExp(r'[:;][-~]?[)D]');
  

  Iterable<Match> matches = arr.map((face) => pattern.firstMatch(face)).whereType<Match>();

  
  return matches.length;
}


void main(){
   print(countSmileys([':)', ';(', ';}', ':-D']));       
  print(countSmileys([';D', ':-(', ':-)', ';~)']));     
  print(countSmileys([';]', ':[', ';*', ':)', ';-D'])); 
}