def solution(sides):
    
    max_side = max(sides)
    sum_of_others = sum(sides) - max_side
    
    if max_side < sum_of_others:
        return 1
    else:
        return 2