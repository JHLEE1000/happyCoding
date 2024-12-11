numbers = []
for _ in range(5):
    number = int(input())
    numbers.append(number)
    
average = sum(numbers) // len(numbers)

numbers.sort()
median = numbers[len(numbers) // 2]

print(average)
print(median)