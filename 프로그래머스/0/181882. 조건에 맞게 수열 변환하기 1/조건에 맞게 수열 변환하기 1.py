def solution(arr):
    
    def process_number(x):
        if x >= 50 and x % 2 == 0:
            return x // 2
        elif x < 50 and x % 2 != 0:
            return x * 2
        else:
            return x
        
    return [process_number(x) for x in arr]