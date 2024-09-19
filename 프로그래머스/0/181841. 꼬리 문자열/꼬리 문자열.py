def solution(str_list, ex):
    
    filtered_list = [s for s in str_list if ex not in s]
    
    result = ''.join(filtered_list)
    
    return result