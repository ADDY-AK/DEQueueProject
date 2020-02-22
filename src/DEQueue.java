public class DEQueue {
  int arr[];
  int rear;
  int front;

  // parameterised Constructor to create queue
  DEQueue(int size)
  {
    rear = -1;
    front = -1;
    arr=new int [size];
  }
  // method to check queue is empty or not

  public boolean isempty()
  {
    return (rear == -1 && front== -1);
  }

  // Method to check queue is full from rear end or not
  public boolean isfullrear()
  {
    boolean response;
    if(rear == arr.length-1)
    {
      response = true;
    }
    else
    {
      response = false;
    }
    return response;
  }
  public boolean isfullfront()
  {
    if(front ==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void insertrear(int data)
  {
    if(isfullrear())
    {
      System.out.println("overflow");
    }
    else {
      if (front == -1 && rear == -1) {
        rear = front = 0;
        arr[rear] = data;
      } else {
        rear++;
        arr[rear] = data;
      }
    }
  }
  // insert front
  public void insertfront(int data)
  {
    if(isfullfront())
    {
      System.out.println("overflow");
    }
    else
    {
      if(front == -1 && rear ==-1)
      {
        rear= front =0;
        arr[front] = data;
      }
      else
      {
        front--;
        arr[front] = data;
      }
    }
  }
  public void removerear()
  {
    if(isempty())
    {
      System.out.println("underflow");
    }
    else
    {
      if(rear == front)
      {
        System.out.println(arr[rear]);
        rear = front = -1;
      }
      else
      {
        System.out.println(arr[rear]);
        rear--;
      }
    }
  }

  public void removefront() {
    if (isempty()) {
      System.out.println("underflow");
    }
    else
    {
      if (front == rear) {
        System.out.println(arr[front]);
        rear = front = -1;
      } else {
        System.out.println(arr[front]);
        front++;
      }
    }}
  public void display()
  {
    for(int i =front; i<=rear;i++){
      System.out.println(arr[i]);
    }
  }


  public static void main(String[] args) {
    DEQueue obj = new DEQueue(5);
    obj.insertfront(10);
    // obj.insertfront(14);
    obj.insertrear(20);
    obj.insertrear(30);
    obj.insertrear(40);
    obj.insertrear(50);
    // obj.insertrear(60);
    //obj.insertfront(15);
    System.out.println("print all the data ");
    obj.display();
    System.out.println("delete from front");
    obj.removefront();
    obj.removefront();
    System.out.println("delete from rear");
    obj.removerear();
    System.out.println("insert new value at rear ");
    obj.insertrear(90);
    System.out.println("print the data");
    obj.display();
  }

}
