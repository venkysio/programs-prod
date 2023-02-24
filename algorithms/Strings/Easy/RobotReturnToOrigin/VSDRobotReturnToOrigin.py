


def judgeCircle(moves: str) -> bool:

    x_coord,y_coord=0,0
    for move in moves:
        if move=="U":
            y_coord+=1
        elif move=="D":
            y_coord-=1
        elif move=="L":
            x_coord-=1
        else:
            x_coord+=1
    return x_coord==0 and y_coord==0


if "__name__"=="__main__":
    moves="UD"
    print(judgeCircle(moves))