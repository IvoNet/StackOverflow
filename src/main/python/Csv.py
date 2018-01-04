
input="""# Samples 1
1,58
2,995
3,585

# Samples 2
15,87
16,952
17,256

# Samples 1
4,89
5,63
6,27"""



def parse(input):
    parsed = {}
    lines = input.split("\n")
    key = "# Unknown"
    for line in lines:
        if line is None or line == "": #  ignore empty line
            continue
        if line.startswith("#") :
            if not parsed.has_key(line):
                parsed[line] = {}
            key = line
            continue
        left, right = line.split(",")
        parsed[key][left] = right
    return parsed

iters=[['EY11', 'EY12', 'EY13', 'EY14'],
       ['EY21', 'EY22', 'EY23', 'EY24'],
       ['PY11', 'PY12', 'PY13', 'PY14'],
       ['PY21', 'PY22', 'PY23', 'PY24']]





if __name__ == '__main__':
    print iterating(iters)