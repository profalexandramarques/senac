#Calcular a idade
ano = 2025
ano_nasc = int(input("Digite o ano do seu nascimento: "))
idade = ano - ano_nasc
print("Sua idade em ",ano," é ", idade," anos!")
if(idade >= 16):
    print("Pode votar!")
else:
    print("Não vota!")