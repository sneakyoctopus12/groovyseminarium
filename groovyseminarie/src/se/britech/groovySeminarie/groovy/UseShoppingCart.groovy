package se.britech.groovySeminarie.groovyimport se.britech.groovySeminarie.java.ShoppingCart
def cart = new ShoppingCart()
def lingonsylt=new Item(name:"Lingonsylt", price: 49.50 as double)
def blodpudding=new Item(name:"Blodpudding", price:9.90 as double)
cart.items = [lingonsylt, blodpudding]

println "Total price: ${cart.calcTotalPrice()}"