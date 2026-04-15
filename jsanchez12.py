#Joan Sanchez
#Lab #12
#CSC321

import math

def rectangleAreaCalculator(base, height):
    return (base * height)

def radiusCircle(radius):
    return (math.pi * (radius ** 2))


base = int(input("Please enter the base of the rectangle: "))
height = int(input("Please enter the height of the rectangle: "))

rectangleAreaResult = rectangleAreaCalculator(base, height)
print("Area of the rectangle: ", rectangleAreaResult)

radius = int(input("Please enter the radius to calculate the area of the circle: "))
circleAreaResult = radiusCircle(radius)
print("Area of the circle: ", circleAreaResult)
