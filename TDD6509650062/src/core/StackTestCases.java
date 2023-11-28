package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {
   public StackTestCases() {
   }
   //TC1
   public void testCreateNewEmptyStack() {
      Stack s1 = new Stack(10);
      assertEquals(true, s1.isEmpty());
      assertEquals(0, s1.getSize());
   }
   //TC2
   public void testPushElmToTop() {
      Stack s2 = new Stack(10);
      Object element = "TestElement";

      try {
         s2.push(element);
         assertEquals(false, s2.isEmpty());
         assertEquals(element, s2.top());
      } catch (Exception var4) {
         fail("Unexpected exception: " + var4.getMessage());
      }

   }
   //TC3
   public void testPushBeTheSameType() {
      Stack s3 = new Stack(10);

      try {
         s3.push(100);
         s3.push(200);
         s3.push(300);
         assertEquals(false, s3.isEmpty());
         assertEquals(300, s3.top());
         s3.push("TestString");
         fail("Expected exception not thrown");
      } catch (Exception var3) {
         assertEquals("All elements in the stack must be of the same type", var3.getMessage());
      }

   }
   //TC4
   public void testLastInFirstOut() {
      Stack s4 = new Stack(4);

      try {
         s4.push(1);
         s4.push(2);
         assertEquals(2, s4.top());
         assertEquals(2, s4.pop());
         assertEquals(1, s4.pop());
      } catch (Exception var3) {
         fail("Unexpected exception: " + var3.getMessage());
      }

   }
   //TC5
   public void testCapacity() {
      Stack s5 = new Stack(5);

      try {
         s5.push(1);
         s5.push(2);
         s5.push(3);
         s5.push(4);
         s5.push(5);
         s5.push(6);
         fail("Element Overflow (Stack size 5 but can add 6 Element)");
      } catch (Exception var3) {
         assertEquals("Stack is Full", var3.getMessage());
      }

   }
}
