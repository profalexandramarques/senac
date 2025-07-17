#Biblioteca
import random
# Gera um número secreto aleatório entre 1 e 10 
numero_secreto = random.randint(1, 10)
#Ler o palpite da tela
palpite = int(input("Digite um palpite: "))
#Compara se o palpite é igual ao número secreto
if(palpite == numero_secreto):
    print("Parabéns você acertou!")
else:
   print("Tente outra vez!")  
#Número secreto
print("O número secreto é ",numero_secreto)     