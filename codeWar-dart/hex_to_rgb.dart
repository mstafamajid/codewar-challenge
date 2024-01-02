

void main(){
print(hexToRGB("#FFFFFF"));
}





Map<String, int> hexToRGB(String hex) {
 
 
  return {
     "r":int.parse(hex.substring(1,3),radix:16),
    "g": int.parse(hex.substring(3,5),radix:16),
    "b": int.parse(hex.substring(5,7),radix:16),
  };
  
}