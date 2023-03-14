def LuckyTrip(number):
    if (int(number[0])+int(number[1])+int(number[2]) == 
        int(number[-1])+int(number[-2])+int(number[-3])):
        print("Lucky one!")
    else: print("Not this one, maybe next?")

ticket = input("Please, ser the Ticket number = ")
LuckyTrip(ticket)