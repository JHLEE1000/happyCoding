
scores = []

for _ in range(5):
    score = int(input())
    if score < 40:
        scores.append(40)
    else:
        scores.append(score)
        
avg_score = sum(scores) // len(scores)

print(avg_score)