# Proje 1

>[22, 27, 16, 2, 18, 6] -> Insertion Sort verilen dizinin sort türüne göre aşamalarını yazınız.

```
[22, 27, 16, 2, 18, 6] n
[2, | 22, 27, 16, 18, 6] n-1
[2, 6, | 22, 27, 16, 18] n-2
[2, 6, 16, | 22, 27, 18] n-3
[2, 6, 16, 18, | 22, 27] 1
```


> Big-O gösterimini yazınız.

```
A:
Big-O Notation => O(n^2)
```


> Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız.

> Average case

> [7, 3, 5, 8, 2, 9, 4, 15, 6] Dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

```
[2, | 3, 5, 8, 7, 9, 4, 15, 6]
[2, 3, | 5, 8, 7, 9, 4, 15, 6]
[2, 3, 4, | 8, 7, 9, 5, 15, 6]
[2, 3, 4, 5, | 7, 9, 8, 15, 6]
```

# Proje 2

> [16, 21, 11, 8, 12, 22]
>  dizinin merge sort türüne göre aşamalarını yazınız.

![](https://r.resimlink.com/ik4xD6.png)


> Big-O gösterimini yazınız.

```
Big-O Notation => O(nlogn)
```

# Proje 3

> [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary Search Tree aşamalarını yazınız.

```
root = 6
                6
              /   \
             5     7
           /        \
          1          8
        /   \         \
       0     3         9
           /   \
          2     4
```