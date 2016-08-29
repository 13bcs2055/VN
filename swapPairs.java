

public String swapPairs(String s) {
     if (s.length() < 2)
          return s;
     else
          return swap(s.charAt(0), s.charAt(1)) + swapPairs(s.substring(2));
}

for (int i = 0; i + 1 < strlen(str); ++i) {
    char tmp = str[i + 1];
    str[i + 1] = str[i];
    str[i] = tmp;
} 


char* exchangePairs(char* str) {
    if (strlen(str) >= 2) {
        // if there are characters left, swap the first two, then recurse
        char tmp = str[1];
        str[1] = str[0];
        str[0] = str[1];

        exchangePairs(str + 2);
    }

    return str;
}
