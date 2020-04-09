## <center>模块三：函数 的学习总结</center>

#### 1. 函数及其存在的意义

* 特殊的、有意义的 **代码块**
* 减少重复代码的编写，提高效率



#### 2. 函数的两种声明方式

* 函数声明方式

  1. 声明： **function 函数名 (形参) { }**

  2. 调用： **函数名 ( );**

     

* 函数字面量式

  1. 声明：**var 变量名 = function (*函数名非必须* ) ( 形参){ }**

  2. 调用： **变量名();**

     ==*tips：要使用变量名调用，使用函数名调用会报错！！！*==

     

* **补充： 第三种声明方式**

  1. 声明： **var 函数名  = new Function(arg0，arg1,arg2...,body);**
  2. 调用:    **函数名();**

  *tips:*

  1. Function 中的**参数全部是字符串 **

  2. 该构造函数的作用是将 参数链接起来组成函数
  3. **如果参数只有==一个, 那么表示函数体== **
  4. **如果参数有==多个, 那么最后一个参数表示新函数,前面的参数是新函数的参数==**
  5. **如果==没有参数, 表示创建一个空函数==**



**~ 举个栗子 ~**

```javascript
/*声明求和函数*/

// 1. 直接声明函数
function sum(num1,num2){
    return num1 + num2;
}
sum(1,10);

// 2.函数字面量式
var Sum = function(num1,num2){
    return num1 + num2;
}
Sum(1,10);

// 3.Function 构造函数声明
var Sumf = new Function('num1','num2','return num1 + num2;')
Sumf(1,10);
```



#### 3. return 和 console.log 的区别

* **return** 是返回一个参数 ， **console.log** 是在控制台打印一个参数
* 一个函数如果**没有 返回值 默认返回 ==undefined==**
* ==**return！= console.log**==



#### 4.变量和函数提升原则

* 变量提升

  1. **声明变量的语句 会提升到作用域顶端**

     ```javascript
     function test () {
         console.log(a);  //undefined
         var a = 123; 
     }
     
     //为什么 是 undefined ？？
     因为 var a = 123 被分为 两部执行 ， 第一步 var a ; 第二部 a = 123;即
     
     function test () {
         var a;
         console.log(a);
         a = 123;
     }
     
     ```

* 函数提升

  1. 字面量式 和 变量提升一样，函数声明式会进行函数提升

  2. **函数提升是整个代码块提升到它所在的作用域的最开始执行**

     ```javascript
     console.log(bar);
     function bar () {
       console.log(1);
     }
     
     //执行顺序相当于
     function bar () {
       console.log(1);
     }
     console.log(bar);
     ```



​		*==函数和变量同时存在时，会优先进行函数提升==*

#### 5.作用域

* 全局作用域

  1. 在函数之外声明的变量，**可以全局访问**

* 局部作用域

  1. 声明在函数内部的变量, **只能在函数内部访问**

     

* **块级作用域(ES6 新增)**

  1. 为什么会产生块级作用域？

     * 函数的作用域 覆盖了全局作用域

     * 循环中的变量泄露为全局变量

       ```javascript
       //  1.函数作用域覆盖了全局作用域,发生了变量提升，函数声明大于var声明的变量，因此函数里面的a提到了前面，在打印a，初始化一个undefined给a,所以打印出了undefined。
       
       var a = '1';
       function fn() {
           console.log(a);
           if (3<2) {
               var a  = 3;
           }
       }
       fn(); // undefined
       
       // 2.循环中的变量泄露为全局变量
       for(var i=0;i<5;i++) {
           console.log(i);
       }
       console.log(i); // 5;
       ```

  2. ES6 的块级作用域

     1. **外层作用域无法获取到内部作用域**

     2. **内外可以使用相同的变量名**

        ```javascript
        // 1.使用 let 命令 外层作用域无法获取内部作用域
        function fn1() {
            let a = 41;
            if(1 == 1) {
                let a = 3;
                console.log(2,a); // 2 3
            }
            console.log(1,a); // 1 41
        }
        
        
        // 2. 外层和内层都使用相同变量名，也都互不干扰
        {  
            {
                let food = 'apple';
                console.log(food); // apple
            }
            let food = 'orange';
            console.log(food); // orange
        }
        ```

        

     

