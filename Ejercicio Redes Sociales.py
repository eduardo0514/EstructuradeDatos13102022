import csv
from tokenize import String
informacion = []
with open('C:/Users/lenovo/Documents/Tarea/presenciaredes.csv', 'r') as redes:
    lector = csv.reader(redes, delimiter=',')
    for row in lector:
        informacion.append(row)


print(informacion)
TSJ = int(informacion[8][8])
TSE = int(informacion[8][3])

resta = TSJ - TSE

print(f'La diferencia de seguidores en Twitter entre enero y junio es: {resta}')


FCE = int(informacion[2][3])
FCF = int(informacion[2][4])
FCM = int(informacion[2][5])
FCA = int(informacion[2][6])
FCMY = int(informacion[2][7])
FCJ = int(informacion[2][8])


TCE = int(informacion[9][3])
TCF = int(informacion[9][4])
TCM = int(informacion[9][5])
TCA = int(informacion[9][6])
TCMY = int(informacion[9][7])
TCJ = int(informacion[9][8])


PROMF = FCE+FCF+FCM+FCA+FCMY+FCJ/6

PROMT = TCE+TCF+TCM+TCA+TCMY+TCJ/6

print(f"El promedio de crecimiento de Facebook es: {PROMF}")

print(f"El promedio de crecimiento de Facebook es: {PROMT}")


mes1 = int(input("Dime un mes: "))
mes2 = int(input("Dime otro mes:"))


valor_mes1 = int(redes[16][mes1 + 2])
valor_mes2 = int(redes[16][mes2 + 2])

diferencia = valor_mes1 - valor_mes2
print(diferencia)