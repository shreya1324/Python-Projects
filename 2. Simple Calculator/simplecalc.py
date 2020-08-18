from tkinter import *

m=Tk()

m.title('BASIC CALCULATOR')

def add():
    e3.delete(0,END)
    res=int(e1.get())+ int(e2.get())
    e3.insert(0,res)

def sub():
    e3.delete(0,END)
    res=int(e1.get())- int(e2.get())
    e3.insert(0,res)

def mul():
    e3.delete(0,END)
    res=int(e1.get())*int(e2.get())
    e3.insert(0,res)

def div():
    e3.delete(0,END)
    res=int(e1.get())/int(e2.get())
    e3.insert(0,res)

def mod():
    e3.delete(0,END)
    res=int(e1.get())% int(e2.get())
    e3.insert(0,res)

def pow():
    e3.delete(0,END)
    res=int(e1.get())** int(e2.get())
    e3.insert(0,res)

def cls():
    e3.delete(0,END)
    e1.delete(0, END)
    e2.delete(0, END)

c=Canvas(m,width=500,height=500,bg='black')
c.pack()

l1=Label(m,text='BASIC CALCULATOR',font=('times',14,'bold'),bg='white')
c.create_window(250,70,window=l1)
l2=Label(m,text='FIRST NO.',font=('times',12,'bold'),fg='white',bg='blue',width=14)
c.create_window(150,120,window=l2)
l3=Label(m,text='SECOND NO.',font=('times',12),fg='white',bg='blue',width=14)
c.create_window(150,170,window=l3)
l4=Label(m,text='RESULT',font=('times',12,'bold'),fg='white',bg='blue',width=14)
c.create_window(150,220,window=l4)

e1=Entry(m,bd=4)
c.create_window(320,120,window=e1)
e2=Entry(m,bd=4)
c.create_window(320,170,window=e2)
e3=Entry(m,bd=4)
c.create_window(320,220,window=e3)

b1=Button(text="+",command=add,bg='purple',fg='white',font=('times',12,'bold'),width=5)
c.create_window(110,300,window=b1)
b2=Button(text="-",command=sub,bg='purple',fg='white',font=('times',12,'bold'),width=5)
c.create_window(150,300,window=b2)
b3=Button(text="*",command=mul,bg='purple',fg='white',font=('times',12,'bold'),width=5)
c.create_window(190,300,window=b3)
b4=Button(text="/",command=div,bg='purple',fg='white',font=('times',12,'bold'),width=5)
c.create_window(230,300,window=b4)
b5=Button(text="%",command=mod,bg='purple',fg='white',font=('times',12,'bold'),width=5)
c.create_window(270,300,window=b5)
b6=Button(text="^",command=pow,bg='purple',fg='white',font=('times',12,'bold'),width=5)
c.create_window(310,300,window=b6)
b7=Button(text="CLS",command=cls,bg='purple',fg='white',font=('times',12,'bold'),width=5)
c.create_window(380,300,window=b7)
b8=Button(text="CLOSE",command=m.destroy,bg='white',font=('times',12,'bold'),width=5)
c.create_window(230,400,window=b8)


m.mainloop()