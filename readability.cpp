#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <math.h>

int count_letters(string s);
int count_words(string s);
int count_sentences(string s);
int main(void)
{
    string sr = get_string("Text: ");
    float l = count_letters(sr)*100 / count_words(sr) ;
    float s = count_sentences(sr)*100 / count_words(sr) ;
    //Coleman-Liau index is computed using the below formula
    float index = 0.0588 * l - 0.296 * s - 15.8;
    int indexi = round(index);

    if (indexi >= 1 && indexi <=16)
        {
            printf("Grade %i\n", indexi);
        }
    else
    {
        if (indexi < 1)
        {
            printf("Before Grade 1\n");
        }
        if (indexi > 16)
        {
            printf("Grade 16+\n");
        }
    }
}
int count_letters(string s)
{
    int n=0;
    while(s[n] != '\0')
    if(islower(s[n]) || isupper(s[n]))
    {
        n++;
    }
    else
    {
        s++;
    }
    return n;
}
int count_words(string s)
{
    int i = 0;
    int wrd = 1;
    while(s[i]!='\0')
    {
        if(s[i]==' ' || s[i]=='\n' || s[i]=='\t')
        {
            wrd++;
        }
        i++;
    }
    return wrd;
}
int count_sentences(string s)
{
    int i = 0;
    int sentence = 0;
    while(s[i] != '\0')
    {
        if(s[i]=='.' || s[i]=='!' || s[i]=='?')
        {
            sentence++;
        }
        i++;
    }
    return sentence;
}



