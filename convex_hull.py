import math

def det(p, q , r):
	return ((p[0]*q[1]) + (q[0]*r[1]) + (r[0]*p[1]) - ((r[0]*q[1]) + (r[1]*p[0]) + (p[1]*q[0])))

def graham_convex_hull(points):
	O = min(points, key=lambda x: x[1])
	points = sorted(points, key=lambda x: math.atan2(x[1] - O[1], x[0] - O[0]))
	points.remove(O)
	stack = [O]
	for p in points:
		while len(stack)>2 and det(stack[-2], stack[-1], p) < 0:
			stack.pop()
		stack.append(p)
	return stack
	
def jarvis_march(points):
	points = sorted(points, key=lambda x: (x[0], x[1]))
	startPoint = points[0]
	start = points[0]
	points.append(start)
	end = points[1]
	hull = [start]
	while points:
		for p in points:
			if det(start, end, p) < 0:
				end = p
		hull.append(end)
		if end == startPoint:
			break
		points.remove(end)
		start = end
		end = points[0]
	return hull