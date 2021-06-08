import os
import en_core_web_sm
import json
#from spacy.symbols import nsubj, VERB

nlp = en_core_web_sm.load() #Esto devolverá un objeto de idioma que contiene todos los componentes y datos necesarios para procesar el texto.


text = input("Text:")
doc = nlp(text)
print (doc)
palabras_sintaxis = {}
frases = []


for num,oracion in enumerate(doc.sents):
    frases.append(f'{oracion}')
    print(frases)

print(frases)
print(len(frases))

for i in range(len(frases)):
    frase_actual = frases[i]
    frase_actual_nlp = nlp(frase_actual)
    print("dentro del bucle:", frase_actual)
    print("nlp dentro del bucle", frase_actual_nlp)
    
    filtrar_frase=[]
    Titulo = ""
    Subtitulo = ""
    verbo = ""
    lista_palabras = []
    FrasesCompleta = []
    lista_sintaxis = []

    print("frase actual", frase_actual)


    for token in frase_actual_nlp: 

        if token.dep_== 'nsubj':
            Titulo = str(token)
        if token.dep_ == 'ROOT':
            verbo = str(token)
        if token.dep_== 'dobj':
            Subtitulo = str(token)

    print("titulo", Titulo)
    print("subtitulo", Subtitulo)
    print("verbo", verbo)

    for word in frase_actual_nlp:
        if word.is_stop==False and word.is_punct==False:
            filtrar_frase.append(word)
    
    print("Frase filtrada:",filtrar_frase)

    for token in filtrar_frase:   
        lista_palabras.append(token.text)

    print("Lista_Palabras:", lista_palabras)
   

    if verbo in lista_palabras:
        lista_palabras.remove(verbo)
    if Titulo in lista_palabras:
        lista_palabras.remove(Titulo)
    if Subtitulo in lista_palabras:
        lista_palabras.remove(Subtitulo)

    
    print("Lista_Palabras:", lista_palabras)

    palabras_sintaxisSub = {}
    palabras_sintaxisRep = {}
   
    if (Titulo in palabras_sintaxis) & (Subtitulo!=""):
        palabras_sintaxisRep = palabras_sintaxis[Titulo]
        palabras_sintaxisSub[Subtitulo] = lista_palabras
        print("palabras_sintaxisSub", palabras_sintaxisSub)
        for x in palabras_sintaxisRep:
            
            x.update(palabras_sintaxisSub)
            print("x",x)
        print("palabras_sintaxis", palabras_sintaxis)    
        

    elif Subtitulo!="":
        palabras_sintaxisSub[Subtitulo] = lista_palabras
        print("palabras_sintaxisSub", palabras_sintaxisSub)
        palabras_sintaxis[Titulo] = [palabras_sintaxisSub]
        print("palabras_sintaxis", palabras_sintaxis)
    
    else:
        palabras_sintaxis[Titulo] = lista_palabras
        print(palabras_sintaxis)

    


        


dir = 'C:/Users/admin/Desktop/TFG/final'  # También es válido 'C:\\Pruebas' o r'C:\Pruebas'
file_name = "data.json"

with open(os.path.join(dir, file_name), 'w') as file:
    json.dump(palabras_sintaxis, file)

