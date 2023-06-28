#include <stdio.h>

int main(){

int hour = 0;
int min = 0;

scanf("%d %d", &hour, &min);


int alram_min = 0;
alram_min = min - 45;

if ((hour == 0) && (min < 46)) {
    hour = 23;
    alram_min = min + 15;
}
else if ((hour ==0) && (alram_min >= 46)) {
    hour = 0;
    alram_min = alram_min - 60;
}

if (alram_min == 60) {
    hour = hour + 1;
    alram_min = 0;
        if (hour == 24){
            hour = 0;
        }
}
if (alram_min<0) {
    hour = hour -1;
    alram_min = alram_min+60; 
}


printf("%d %d", hour, alram_min);

    return 0;
}