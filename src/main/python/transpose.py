#http://stackoverflow.com/questions/37999302/python-modify-list-of-lists/

iters=[['EY11', 'EY12', 'EY13', 'EY14'],
       ['EY21', 'EY22', 'EY23', 'EY24'],
       ['PY11', 'PY12', 'PY13', 'PY14'],
       ['PY21', 'PY22', 'PY23', 'PY24']]


def solution_programmed():
    if len(iters) > 0:
        range_len = len(iters[0])
        ret = []
        for idx in range(0,range_len):
            ret.append([i[idx] for i in iters])
        return ret
    return None

def solution_with_zip():
    return list(zip(*iters))

def solution_with_zip_2():
    return list(map(list, zip(*iters)))

def solution_one_liner():
    return [[i[x] for i in iters] for x in range(0,4)]

def solution_numpy():
    import numpy as np
    return np.array(iters).transpose()

if __name__ == '__main__':
    print solution_programmed()
    print solution_with_zip()
    print solution_with_zip_2()
    print solution_one_liner()
    print solution_numpy()