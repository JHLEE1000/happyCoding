def solution(arr, delete_list):
    
    delete_set = set(delete_list)
    
    answer = [num for num in arr if num not in delete_set] 
    
    return answer