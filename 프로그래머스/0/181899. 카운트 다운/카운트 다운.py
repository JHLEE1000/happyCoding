def solution(start_num, end_num):
    
    count = start_num - end_num + 1
    answer = [i for i in range(start_num, end_num-1, -1)]
    return answer