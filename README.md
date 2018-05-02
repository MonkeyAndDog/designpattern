Design Pattern
---

迭代器模式（Iterator）
---
> 一个一个遍历

|名称|说明 |
|---|---|
|Aggregate|表示集合的接口|
|Iterator|遍历集合的接口|
|AggregateItem|集合中元素的接口（声明类接口）|

适配器模式（Adapter）
---
> 加个适配器以便复用

|名称|说明|
|---|---|
|Target|调用者要使用的接口|
|Adapter|适配者|
|Adaptee|被适配（也就是此处的Banner）|

* 说明：
    1. 方便新老系统接口适配
    2. 对同种框架的适配
    3. Android中的适配
 
模板方法（Template Method）
---
> 将具体的实现交给子类处理
 
|名称|说明|
|---|---|
|AbstractClass|确定了固定的处理逻辑，但是没实现核心的处理|
|ConcreteClass|具体类，实现了抽象类的核心处理|

    
