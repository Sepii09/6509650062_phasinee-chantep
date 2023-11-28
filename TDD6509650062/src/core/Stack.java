package core;

public class Stack implements IStack {
   private int size;
   private int top = -1;
   private Object[] stack;

   Stack(int size) {
      this.size = size;
      this.stack = new Object[size];
   }

   public int getSize() {
      return this.top + 1;
   }

   public boolean isEmpty() {
      return this.top == -1;
   }

   public boolean isFull() {
      return this.top == this.size - 1;
   }

   public void push(Object ele) throws Exception {
      if (this.isEmpty()) {
         ++this.top;
         this.stack[this.top] = ele;
      } else if (this.isFull()) {
         throw new Exception("Stack is Full");
      } else if (ele.getClass().getName() != this.top().getClass().getName()) {
         throw new Exception("All elements in the stack must be of the same type");
      } else {
         ++this.top;
         this.stack[this.top] = ele;
      }
   }

   public Object pop() {
      --this.top;
      return this.stack[this.top + 1];
   }

   public Object top() {
      return this.isEmpty() ? -1 : this.stack[this.top];
   }
}