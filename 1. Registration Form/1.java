from tkinter import *
from tkinter import messagebox as mb
from tkcalendar import DateEntry
import datetime
import csv


wn = Tk()
wn.geometry('600x540')
wn.title("REGISTRATION FORM")
wn.configure(background='grey')

#defining function msg() using messagebox

def msg():
    course = cvar.get()
    select = var.get()
    if(select == 1 or select == 2):
        # get the index of the last character in the widget,if it is zero,it is empty
        if (e1.index("end") == 0):
            mb.showwarning('Missing details', 'enter your name')
        elif(e2.index("end") == 0):
            mb.showwarning('Missing details', 'enter your email id')
        elif(e3.index("end") == 0):
            mb.showwarning('Missing details', 'enter your contact number')
        else:
            mb.showinfo('Success', 'Registration done successfully for the course '+ course)
    else:
            mb.showinfo('Missing details', 'enter your gender')

# creating labels and entry widgets


l1 = Label(wn, text="REGISTRATION  FORM",width=25,font=("times",20,"bold"),bg='black',fg='white')
l1.place(x=70,y=50)
l2 = Label(wn, text="NAME  : ",width=10,font=("times",12,"bold"),bg='black',fg='white')
l2.place(x=70,y=130)
e1 = Entry(wn,width=30,bd=2)
e1.place(x=240,y=130)
l3 = Label(wn, text="EMAIL  : ",width=10,font=("times",12,"bold"),fg='white',bg='black')
l3.place(x=70,y=180)
e2 = Entry(wn,width=30,bd=2)
e2.place(x=240,y=180)
l4 = Label(wn, text="DOB  : ",width=10,font=("times",12,"bold"),fg="white",bg='black')
l4.place(x=70,y=230)

# dateEntry -Date selection entry with drop-down calendar
dob = DateEntry(wn, width=27, background='brown', foreground='white',date_pattern='dd/mm/YY', borderwidth=3)
dob.place(x=240,y=230)

l5 = Label(wn, text="GENDER  : ", width=10, font=("times",12,"bold"),fg='white',bg='black')
l5.place(x=70,y=280)

# radiobuttons
var = IntVar()
r1 = Radiobutton(wn, text="MALE", variable=var, value=1, font=("times",12,"bold"),bg='grey')
r1.place(x=235,y=280)
r2 = Radiobutton(wn, text="FEMALE", variable=var, value=2, font=("times",12,"bold"),bg='grey')
r2.place(x=315,y=280)

l6 = Label(wn, text="PHONE NO.",width=10,font=("times",12,"bold"),fg="white",bg='black')
l6.place(x=70,y=320)
e3 = Entry(wn,width=30,bd=2)
e3.place(x=240,y=320)
l7 = Label(wn, text="COURSE  : ",width=10,font=("times",12,"bold"),fg="white",bg='black')
l7.place(x=70,y=370)

# create a dropdown menu with the OptionMenu widget
cvar = StringVar()
cvar.set("SELECT COURSE")
option = ("Python", "Javascript", "Perl","Java")
o = OptionMenu(wn,cvar, *option)
o.config(font=("times",11,"bold"),bd=3)
o.place(x=240,y=365,width=190)

# submit and cancel buttons
b1 = Button(wn, text='SUBMIT',command=saveinfo,width=15,bg='green',fg='white',font=("times",12,"bold"))
b1.place(x=120,y=440)
b2 = Button(wn, text='CANCEL',command=wn.destroy,width=15,bg='maroon',fg='white',font=("times",12,"bold"))
b2.place(x=320,y=440)

wn.mainloop()
