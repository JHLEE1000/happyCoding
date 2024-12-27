
numbers = []
for _ in range(9):
    numbers.append(int(input()))
    
max_num = max(numbers)
max_idx = numbers.index(max_num) + 1

print(max_num)
print(max_idx)