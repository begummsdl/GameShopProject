package DataAccess.Concrete;

import DataAccess.Abstract.EntityRepository;

public class EntityRepositoryBase<TEntity> implements EntityRepository<TEntity>  {

	@Override
	public void add(TEntity entity) {
		System.out.println("kay�t edildi");
		
	}

	@Override
	public void update(TEntity entity) {
		System.out.println("g�ncellendi");
		
	}

	@Override
	public void delete(TEntity entity) {
		System.out.println("silindi");
		
	}

}
