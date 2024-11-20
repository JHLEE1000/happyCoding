def solution(rsp):
    win_map = {
        '2': '0',
        '0': '5',
        '5': '2'
    }
    
    result = []
    
    for char in rsp:
        result.append(win_map[char])
        
    return ''.join(result)