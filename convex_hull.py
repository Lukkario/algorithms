import math

def det(p, q , r):
	return ((p[0]*q[1]) + (q[0]*r[1]) + (r[0]*p[1]) - ((r[0]*q[1]) + (r[1]*p[0]) + (p[1]*q[0])))

def graham_convex_hull(points):
	O = min(points, key=lambda x: x[1])
	points = sorted(points, key=lambda x: math.atan2(x[1] - O[1], x[0] - O[0]))
	punkty.remove(O)
	stack = [O]
	for p in punkty:
		while len(stack)>2 and det(stack[-2], stack[-1], p) < 0:
			stack.pop()
		stack.append(p)
	return stack